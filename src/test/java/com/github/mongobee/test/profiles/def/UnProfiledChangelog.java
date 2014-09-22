package com.github.mongobee.test.profiles.def;

import com.github.mongobee.changeset.Changelog;
import com.github.mongobee.changeset.Changeset;
import org.springframework.context.annotation.Profile;

/**
 * @author lstolowski
 * @since 2014-09-17
 */
@Changelog
public class UnProfiledChangelog {
  @Changeset(author = "testuser", id = "Pdev1", order = "01")
  public void testChangeset(){
    System.out.println("invoked Pdev1");
  }
  @Changeset(author = "testuser", id = "Pdev2", order = "02")
  public void testChangeset2(){
    System.out.println("invoked Pdev2");
  }
  @Changeset(author = "testuser", id = "Pdev3", order = "03")
  public void testChangeset3(){
    System.out.println("invoked Pdev3");
  }
  @Changeset(author = "testuser", id = "Pdev4", order = "04")
  @Profile("pro")
  public void testChangeset4(){
    System.out.println("invoked Pdev4");
  }
}
