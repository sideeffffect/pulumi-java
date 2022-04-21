// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.awsnative.iotsitewise.enums.AssetModelDataType;
import com.pulumi.awsnative.iotsitewise.enums.AssetModelDataTypeSpec;
import com.pulumi.awsnative.iotsitewise.inputs.AssetModelPropertyTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about an asset model property.
 * 
 */
public final class AssetModelPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetModelPropertyArgs Empty = new AssetModelPropertyArgs();

    /**
     * The data type of the asset model property.
     * 
     */
    @Import(name="dataType", required=true)
    private Output<AssetModelDataType> dataType;

    public Output<AssetModelDataType> dataType() {
        return this.dataType;
    }

    /**
     * The data type of the structure for this property.
     * 
     */
    @Import(name="dataTypeSpec")
    private @Nullable Output<AssetModelDataTypeSpec> dataTypeSpec;

    public Optional<Output<AssetModelDataTypeSpec>> dataTypeSpec() {
        return Optional.ofNullable(this.dataTypeSpec);
    }

    /**
     * Customer provided ID for property.
     * 
     */
    @Import(name="logicalId", required=true)
    private Output<String> logicalId;

    public Output<String> logicalId() {
        return this.logicalId;
    }

    /**
     * The name of the asset model property.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The property type
     * 
     */
    @Import(name="type", required=true)
    private Output<AssetModelPropertyTypeArgs> type;

    public Output<AssetModelPropertyTypeArgs> type() {
        return this.type;
    }

    /**
     * The unit of the asset model property, such as Newtons or RPM.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private AssetModelPropertyArgs() {}

    private AssetModelPropertyArgs(AssetModelPropertyArgs $) {
        this.dataType = $.dataType;
        this.dataTypeSpec = $.dataTypeSpec;
        this.logicalId = $.logicalId;
        this.name = $.name;
        this.type = $.type;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetModelPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelPropertyArgs $;

        public Builder() {
            $ = new AssetModelPropertyArgs();
        }

        public Builder(AssetModelPropertyArgs defaults) {
            $ = new AssetModelPropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataType(Output<AssetModelDataType> dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder dataType(AssetModelDataType dataType) {
            return dataType(Output.of(dataType));
        }

        public Builder dataTypeSpec(@Nullable Output<AssetModelDataTypeSpec> dataTypeSpec) {
            $.dataTypeSpec = dataTypeSpec;
            return this;
        }

        public Builder dataTypeSpec(AssetModelDataTypeSpec dataTypeSpec) {
            return dataTypeSpec(Output.of(dataTypeSpec));
        }

        public Builder logicalId(Output<String> logicalId) {
            $.logicalId = logicalId;
            return this;
        }

        public Builder logicalId(String logicalId) {
            return logicalId(Output.of(logicalId));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(Output<AssetModelPropertyTypeArgs> type) {
            $.type = type;
            return this;
        }

        public Builder type(AssetModelPropertyTypeArgs type) {
            return type(Output.of(type));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public AssetModelPropertyArgs build() {
            $.dataType = Objects.requireNonNull($.dataType, "expected parameter 'dataType' to be non-null");
            $.logicalId = Objects.requireNonNull($.logicalId, "expected parameter 'logicalId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
