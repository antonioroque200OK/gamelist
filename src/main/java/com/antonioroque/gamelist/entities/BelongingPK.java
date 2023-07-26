package com.antonioroque.gamelist.entities;

public class BelongingPK {

  private Belonging id;

  private Integer position;

  public BelongingPK() {}

  public BelongingPK(Belonging id, Integer position) {
    this.id = id;
    this.position = position;
  }

  public Belonging getId() {
    return this.id;
  }

  public Integer getPosition() {
    return this.position;
  }

  public void setId(Belonging id) {
    this.id = id;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((position == null) ? 0 : position.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BelongingPK other = (BelongingPK) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (position == null) {
      if (other.position != null)
        return false;
    } else if (!position.equals(other.position))
      return false;
    return true;
  }



}
