package org.aimlang.core.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Random
 *
 * @author anton
 * @since 01/07/17
 */
public class Random implements Tag<Li> {
    private java.util.Random randomGenerator;
    private List<Li> options = new ArrayList<>();

    public Random(List<Li> options) {
        this.options = options;
        randomGenerator = new java.util.Random();
    }

    @Override
    public TagType getType() {
        return TagType.RANDOM;
    }

    @Override
    public List<Li> getValue() {//FIXME return Li
        int index = randomGenerator.nextInt(options.size());
        return Collections.singletonList(options.get(index));
    }

    @Override
    public List<Li> getChilds() {
        return options;
    }
}
