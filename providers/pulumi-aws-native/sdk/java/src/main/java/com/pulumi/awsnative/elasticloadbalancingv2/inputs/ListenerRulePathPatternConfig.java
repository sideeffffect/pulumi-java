// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRulePathPatternConfig extends com.pulumi.resources.InvokeArgs {

    public static final ListenerRulePathPatternConfig Empty = new ListenerRulePathPatternConfig();

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private ListenerRulePathPatternConfig() {}

    private ListenerRulePathPatternConfig(ListenerRulePathPatternConfig $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRulePathPatternConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRulePathPatternConfig $;

        public Builder() {
            $ = new ListenerRulePathPatternConfig();
        }

        public Builder(ListenerRulePathPatternConfig defaults) {
            $ = new ListenerRulePathPatternConfig(Objects.requireNonNull(defaults));
        }

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ListenerRulePathPatternConfig build() {
            return $;
        }
    }

}
