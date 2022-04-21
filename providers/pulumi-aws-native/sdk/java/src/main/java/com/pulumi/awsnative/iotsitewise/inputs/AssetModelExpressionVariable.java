// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.awsnative.iotsitewise.inputs.AssetModelVariableValue;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AssetModelExpressionVariable extends com.pulumi.resources.InvokeArgs {

    public static final AssetModelExpressionVariable Empty = new AssetModelExpressionVariable();

    /**
     * The friendly name of the variable to be used in the expression.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The variable that identifies an asset property from which to use values.
     * 
     */
    @Import(name="value", required=true)
    private AssetModelVariableValue value;

    public AssetModelVariableValue value() {
        return this.value;
    }

    private AssetModelExpressionVariable() {}

    private AssetModelExpressionVariable(AssetModelExpressionVariable $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetModelExpressionVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelExpressionVariable $;

        public Builder() {
            $ = new AssetModelExpressionVariable();
        }

        public Builder(AssetModelExpressionVariable defaults) {
            $ = new AssetModelExpressionVariable(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(AssetModelVariableValue value) {
            $.value = value;
            return this;
        }

        public AssetModelExpressionVariable build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
