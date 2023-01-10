package com.github.bartgora;

import com.github.bartgora.factory.ChessFactory;
import com.github.bartgora.pieces.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

class ChessFactoryTest {

    @Test
    void shouldReturnPawn() {

        ChessFactory chessFactory = new ChessFactory();
        var chessPieces = chessFactory.createPieces(List.of("Pa1"));

        var piece = chessPieces.get(0);

        assertThat(piece).isInstanceOf(Pawn.class).extracting("rank", "file").contains("a", 1);
    }

    @Test
    void shouldReturnRook() {

        ChessFactory chessFactory = new ChessFactory();
        var chessPieces = chessFactory.createPieces(List.of("Rb1"));

        var piece = chessPieces.get(0);

        assertThat(piece).isInstanceOf(Rook.class).extracting("rank", "file").contains("b", 1);
    }

    @Test
    void shouldReturnQueen() {

        ChessFactory chessFactory = new ChessFactory();
        var chessPieces = chessFactory.createPieces(List.of("Qc6"));

        var piece = chessPieces.get(0);

        assertThat(piece).isInstanceOf(Queen.class).extracting("rank", "file").contains("c", 6);
    }

    @Test
    void shouldReturnKing() {

        ChessFactory chessFactory = new ChessFactory();
        var chessPieces = chessFactory.createPieces(List.of("Kc6"));

        var piece = chessPieces.get(0);

        assertThat(piece).isInstanceOf(King.class).extracting("rank", "file").contains("c", 6);
    }

    @Test
    void shouldReturnKnight() {

        ChessFactory chessFactory = new ChessFactory();
        var chessPieces = chessFactory.createPieces(List.of("Nc6"));

        var piece = chessPieces.get(0);

        assertThat(piece).isInstanceOf(Knight.class).extracting("rank", "file").contains("c", 6);
    }

    @Test
    void shouldReturnBishop() {

        ChessFactory chessFactory = new ChessFactory();
        var chessPieces = chessFactory.createPieces(List.of("Bc6"));

        var piece = chessPieces.get(0);

        assertThat(piece).isInstanceOf(Bishop.class).extracting("rank", "file").contains("c", 6);
    }

    @Test
    void shouldReturnWhiteBoard() {

        ChessFactory chessFactory = new ChessFactory();
        var board = List.of("Ra1", "Nb1", "Bc1", "Qd1", "Ke1", "Bf1","Ng1", "Rh1",
                                        "Pa2", "Pb2", "Pc2", "Pd2", "Pf2","Pg2", "Ph2");
        var chessPieces = chessFactory.createPieces(board);

        var piece = chessPieces.get(0);

        assertThat(chessPieces).extracting("rank", "file")
                               .contains(tuple("a", 1))
                               .contains(tuple("b", 1))
                               .contains(tuple("c", 1))
                               .contains(tuple("d", 1))
                               .contains(tuple("e", 1))
                               .contains(tuple("f", 1))
                               .contains(tuple("g", 1))
                               .contains(tuple("h", 1))
                               .contains(tuple("a", 2))
                               .contains(tuple("b", 2))
                               .contains(tuple("c", 3))
                               .contains(tuple("d", 4))
                               .contains(tuple("e", 5))
                               .contains(tuple("f", 6))
                               .contains(tuple("g", 7))
                               .contains(tuple("h", 8));

    }
}
