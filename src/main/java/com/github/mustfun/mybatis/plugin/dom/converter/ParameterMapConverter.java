package com.github.mustfun.mybatis.plugin.dom.converter;

import com.github.mustfun.mybatis.plugin.dom.model.IdDomElement;
import com.github.mustfun.mybatis.plugin.dom.model.Mapper;
import com.intellij.util.xml.ConvertContext;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * @author yanglin
 */
public class ParameterMapConverter extends IdBasedTagConverter{

  @NotNull @Override
  public Collection<? extends IdDomElement> getComparisons(@Nullable Mapper mapper,
                                                           ConvertContext context) {
    return mapper.getParameterMaps();
  }

}
