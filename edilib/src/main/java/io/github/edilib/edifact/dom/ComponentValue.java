package io.github.edilib.edifact.dom;

import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode
public class ComponentValue implements Value {

    public final List<SimpleValue> values;

    public ComponentValue(List<SimpleValue> values) {
        this.values = values;
    }

    public ComponentValue(String... stringValues) {
        this(Arrays.stream(stringValues)
                .map((s) -> new SimpleValue(s, null, null))
                .collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "{" + this.values.stream().map(SimpleValue::toString).collect(Collectors.joining(", ")) + "}";
    }
}
