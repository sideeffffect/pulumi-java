// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StringContains Advanced Filter.
 * 
 */
public final class StringContainsAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final StringContainsAdvancedFilterArgs Empty = new StringContainsAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringContains&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private Output<String> operatorType;

    public Output<String> operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private StringContainsAdvancedFilterArgs() {}

    private StringContainsAdvancedFilterArgs(StringContainsAdvancedFilterArgs $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StringContainsAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StringContainsAdvancedFilterArgs $;

        public Builder() {
            $ = new StringContainsAdvancedFilterArgs();
        }

        public Builder(StringContainsAdvancedFilterArgs defaults) {
            $ = new StringContainsAdvancedFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder operatorType(Output<String> operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        public Builder operatorType(String operatorType) {
            return operatorType(Output.of(operatorType));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public StringContainsAdvancedFilterArgs build() {
            $.operatorType = Codegen.stringProp("operatorType").output().arg($.operatorType).require();
            return $;
        }
    }

}
