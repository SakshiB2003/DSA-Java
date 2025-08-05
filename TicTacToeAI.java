import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeAI extends JFrame implements ActionListener {
    JButton[][] buttons = new JButton[3][3];
    char[][] board = new char[3][3];
    boolean playerTurn = true;
    JLabel statusLabel;
    JLabel scoreLabel;
    int playerScore = 0, aiScore = 0;

    public TicTacToeAI() {
        setTitle("Tic Tac Toe with AI");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel with Title and Restart
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel title = new JLabel("Tic Tac Toe vs AI", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        JButton resetBtn = new JButton("Restart");
        resetBtn.addActionListener(e -> resetGame(true));
        topPanel.add(title, BorderLayout.CENTER);
        topPanel.add(resetBtn, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);

        // Grid Panel (Game board)
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setBackground(Color.BLACK);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("SansSerif", Font.BOLD, 48));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].setBackground(Color.WHITE);
                buttons[i][j].addActionListener(this);
                gridPanel.add(buttons[i][j]);
                board[i][j] = ' ';
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        // Bottom Panel with Status and Score
        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
        statusLabel = new JLabel("Your turn (X)", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        scoreLabel = new JLabel("Score - You: 0 | AI: 0", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        bottomPanel.add(statusLabel);
        bottomPanel.add(scoreLabel);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!playerTurn) return;

        JButton btnClicked = (JButton) e.getSource();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (btnClicked == buttons[i][j] && board[i][j] == ' ') {
                    board[i][j] = 'X';
                    buttons[i][j].setText("X");
                    buttons[i][j].setForeground(Color.BLUE);
                    playerTurn = false;
                    statusLabel.setText("AI's turn...");

                    if (checkWin('X')) {
                        playerScore++;
                        updateScore();
                        showResult("You win!");
                        return;
                    } else if (isBoardFull()) {
                        showResult("It's a draw!");
                        return;
                    } else {
                        Timer timer = new Timer(500, evt -> {
                            aiMove();
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                    return;
                }
            }
        }
    }

    private void aiMove() {
        int[] move = bestMove();
        int row = move[0];
        int col = move[1];

        board[row][col] = 'O';
        buttons[row][col].setText("O");
        buttons[row][col].setForeground(Color.RED);

        if (checkWin('O')) {
            aiScore++;
            updateScore();
            showResult("AI wins!");
        } else if (isBoardFull()) {
            showResult("It's a draw!");
        } else {
            playerTurn = true;
            statusLabel.setText("Your turn (X)");
        }
    }

    private int[] bestMove() {
        int bestScore = Integer.MIN_VALUE;
        int[] move = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = 'O';
                    int score = minimax(false);
                    board[i][j] = ' ';
                    if (score > bestScore) {
                        bestScore = score;
                        move[0] = i;
                        move[1] = j;
                    }
                }
            }
        }
        return move;
    }

    private int minimax(boolean isMaximizing) {
        if (checkWin('O')) return 1;
        if (checkWin('X')) return -1;
        if (isBoardFull()) return 0;

        int bestScore = isMaximizing ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = isMaximizing ? 'O' : 'X';
                    int score = minimax(!isMaximizing);
                    board[i][j] = ' ';
                    bestScore = isMaximizing ?
                            Math.max(score, bestScore) :
                            Math.min(score, bestScore);
                }
            }
        }

        return bestScore;
    }

    private boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) return true;
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) return true;
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) return true;

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) return true;

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    private void showResult(String message) {
        statusLabel.setText(message);
        JOptionPane.showMessageDialog(this, message);
        resetGame(false);
    }

    private void resetGame(boolean fullReset) {
        playerTurn = true;
        statusLabel.setText("Your turn (X)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
                buttons[i][j].setText("");
            }
        }

        if (fullReset) {
            playerScore = 0;
            aiScore = 0;
            updateScore();
        }
    }

    private void updateScore() {
        scoreLabel.setText("Score - You: " + playerScore + " | AI: " + aiScore);
    }

    public static void main(String[] args) {
        new TicTacToeAI();
    }
}
