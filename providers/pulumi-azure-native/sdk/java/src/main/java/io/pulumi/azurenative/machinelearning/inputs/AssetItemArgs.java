// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.AssetType;
import io.pulumi.azurenative.machinelearning.inputs.BlobLocationArgs;
import io.pulumi.azurenative.machinelearning.inputs.InputPortArgs;
import io.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterArgs;
import io.pulumi.azurenative.machinelearning.inputs.OutputPortArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about an asset associated with the web service.
 * 
 */
public final class AssetItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetItemArgs Empty = new AssetItemArgs();

    /**
     * Asset's Id.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Information about the asset's input ports.
     * 
     */
    @InputImport(name="inputPorts")
      private final @Nullable Input<Map<String,InputPortArgs>> inputPorts;

    public Input<Map<String,InputPortArgs>> getInputPorts() {
        return this.inputPorts == null ? Input.empty() : this.inputPorts;
    }

    /**
     * Access information for the asset.
     * 
     */
    @InputImport(name="locationInfo", required=true)
      private final Input<BlobLocationArgs> locationInfo;

    public Input<BlobLocationArgs> getLocationInfo() {
        return this.locationInfo;
    }

    /**
     * If the asset is a custom module, this holds the module's metadata.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Asset's friendly name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Information about the asset's output ports.
     * 
     */
    @InputImport(name="outputPorts")
      private final @Nullable Input<Map<String,OutputPortArgs>> outputPorts;

    public Input<Map<String,OutputPortArgs>> getOutputPorts() {
        return this.outputPorts == null ? Input.empty() : this.outputPorts;
    }

    /**
     * If the asset is a custom module, this holds the module's parameters.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<ModuleAssetParameterArgs>> parameters;

    public Input<List<ModuleAssetParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Asset's type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,AssetType>> type;

    public Input<Either<String,AssetType>> getType() {
        return this.type;
    }

    public AssetItemArgs(
        @Nullable Input<String> id,
        @Nullable Input<Map<String,InputPortArgs>> inputPorts,
        Input<BlobLocationArgs> locationInfo,
        @Nullable Input<Map<String,String>> metadata,
        Input<String> name,
        @Nullable Input<Map<String,OutputPortArgs>> outputPorts,
        @Nullable Input<List<ModuleAssetParameterArgs>> parameters,
        Input<Either<String,AssetType>> type) {
        this.id = id;
        this.inputPorts = inputPorts;
        this.locationInfo = Objects.requireNonNull(locationInfo, "expected parameter 'locationInfo' to be non-null");
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssetItemArgs() {
        this.id = Input.empty();
        this.inputPorts = Input.empty();
        this.locationInfo = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.outputPorts = Input.empty();
        this.parameters = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Map<String,InputPortArgs>> inputPorts;
        private Input<BlobLocationArgs> locationInfo;
        private @Nullable Input<Map<String,String>> metadata;
        private Input<String> name;
        private @Nullable Input<Map<String,OutputPortArgs>> outputPorts;
        private @Nullable Input<List<ModuleAssetParameterArgs>> parameters;
        private Input<Either<String,AssetType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inputPorts = defaults.inputPorts;
    	      this.locationInfo = defaults.locationInfo;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputPorts = defaults.outputPorts;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder inputPorts(@Nullable Input<Map<String,InputPortArgs>> inputPorts) {
            this.inputPorts = inputPorts;
            return this;
        }

        public Builder inputPorts(@Nullable Map<String,InputPortArgs> inputPorts) {
            this.inputPorts = Input.ofNullable(inputPorts);
            return this;
        }

        public Builder locationInfo(Input<BlobLocationArgs> locationInfo) {
            this.locationInfo = Objects.requireNonNull(locationInfo);
            return this;
        }

        public Builder locationInfo(BlobLocationArgs locationInfo) {
            this.locationInfo = Input.of(Objects.requireNonNull(locationInfo));
            return this;
        }

        public Builder metadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder outputPorts(@Nullable Input<Map<String,OutputPortArgs>> outputPorts) {
            this.outputPorts = outputPorts;
            return this;
        }

        public Builder outputPorts(@Nullable Map<String,OutputPortArgs> outputPorts) {
            this.outputPorts = Input.ofNullable(outputPorts);
            return this;
        }

        public Builder parameters(@Nullable Input<List<ModuleAssetParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ModuleAssetParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder type(Input<Either<String,AssetType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,AssetType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public AssetItemArgs build() {
            return new AssetItemArgs(id, inputPorts, locationInfo, metadata, name, outputPorts, parameters, type);
        }
    }
}
