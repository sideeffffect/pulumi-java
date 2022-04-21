// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis variable.
 * 
 */
public final class SsisVariableResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisVariableResponse Empty = new SsisVariableResponse();

    /**
     * Variable type.
     * 
     */
    @Import(name="dataType")
    private @Nullable String dataType;

    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * Variable description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Variable id.
     * 
     */
    @Import(name="id")
    private @Nullable Double id;

    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Variable name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether variable is sensitive.
     * 
     */
    @Import(name="sensitive")
    private @Nullable Boolean sensitive;

    public Optional<Boolean> sensitive() {
        return Optional.ofNullable(this.sensitive);
    }

    /**
     * Variable sensitive value.
     * 
     */
    @Import(name="sensitiveValue")
    private @Nullable String sensitiveValue;

    public Optional<String> sensitiveValue() {
        return Optional.ofNullable(this.sensitiveValue);
    }

    /**
     * Variable value.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private SsisVariableResponse() {}

    private SsisVariableResponse(SsisVariableResponse $) {
        this.dataType = $.dataType;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.sensitive = $.sensitive;
        this.sensitiveValue = $.sensitiveValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsisVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsisVariableResponse $;

        public Builder() {
            $ = new SsisVariableResponse();
        }

        public Builder(SsisVariableResponse defaults) {
            $ = new SsisVariableResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataType(@Nullable String dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder id(@Nullable Double id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder sensitive(@Nullable Boolean sensitive) {
            $.sensitive = sensitive;
            return this;
        }

        public Builder sensitiveValue(@Nullable String sensitiveValue) {
            $.sensitiveValue = sensitiveValue;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public SsisVariableResponse build() {
            return $;
        }
    }

}
