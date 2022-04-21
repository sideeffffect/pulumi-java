// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceSchedulingNodeAffinity extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceSchedulingNodeAffinity Empty = new GetInstanceSchedulingNodeAffinity();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="operator", required=true)
    private String operator;

    public String operator() {
        return this.operator;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetInstanceSchedulingNodeAffinity() {}

    private GetInstanceSchedulingNodeAffinity(GetInstanceSchedulingNodeAffinity $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceSchedulingNodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceSchedulingNodeAffinity $;

        public Builder() {
            $ = new GetInstanceSchedulingNodeAffinity();
        }

        public Builder(GetInstanceSchedulingNodeAffinity defaults) {
            $ = new GetInstanceSchedulingNodeAffinity(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetInstanceSchedulingNodeAffinity build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
