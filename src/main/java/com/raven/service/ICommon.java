
package com.raven.service;

import java.util.List;

public interface ICommon<T,Y> {
    List<T> getAll();
    Boolean create(Y y);
    Boolean update(Y y);
    Boolean delete(String id);
    int genMaTuDong();
}
