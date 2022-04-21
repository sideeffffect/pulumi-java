// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplify.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BranchEnvironmentVariable extends com.pulumi.resources.InvokeArgs {

    public static final BranchEnvironmentVariable Empty = new BranchEnvironmentVariable();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private BranchEnvironmentVariable() {}

    private BranchEnvironmentVariable(BranchEnvironmentVariable $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BranchEnvironmentVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BranchEnvironmentVariable $;

        public Builder() {
            $ = new BranchEnvironmentVariable();
        }

        public Builder(BranchEnvironmentVariable defaults) {
            $ = new BranchEnvironmentVariable(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public BranchEnvironmentVariable build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
