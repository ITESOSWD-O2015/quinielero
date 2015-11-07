import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.iteso.quinielero.quiniela.Quiniela;
import com.iteso.quinielero.quiniela.Team;
import com.iteso.quinielero.servlets.pool.ModoServlet;

public class Mode_test {
Quiniela quiniela;

@Test
public void TestLeagueMode(){
	  Quiniela quiniela = new Quiniela();
      quiniela.setPoolMode("league");
      assertEquals("league", quiniela.getPoolMode());
}

@Test
public void TestGameMode(){
	  Quiniela quiniela = new Quiniela();
      quiniela.setPoolMode("game");
      assertEquals("game", quiniela.getPoolMode());
}

@Test
public void TestRoundMode(){
	  Quiniela quiniela = new Quiniela();
      quiniela.setPoolMode("round");
      assertEquals("round", quiniela.getPoolMode());
}
