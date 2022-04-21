// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StringIn Advanced Filter.
 * 
 */
public final class StringInAdvancedFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final StringInAdvancedFilterResponse Empty = new StringInAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringIn&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private String operatorType;

    public String operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private StringInAdvancedFilterResponse() {}

    private StringInAdvancedFilterResponse(StringInAdvancedFilterResponse $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StringInAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StringInAdvancedFilterResponse $;

        public Builder() {
            $ = new StringInAdvancedFilterResponse();
        }

        public Builder(StringInAdvancedFilterResponse defaults) {
            $ = new StringInAdvancedFilterResponse(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder operatorType(String operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public StringInAdvancedFilterResponse build() {
            $.operatorType = Codegen.stringProp("operatorType").arg($.operatorType).require();
            return $;
        }
    }

}
