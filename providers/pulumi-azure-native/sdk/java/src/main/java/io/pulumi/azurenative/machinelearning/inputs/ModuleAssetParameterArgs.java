// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.ModeValueInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameter definition for a module asset.
 * 
 */
public final class ModuleAssetParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleAssetParameterArgs Empty = new ModuleAssetParameterArgs();

    /**
     * Definitions for nested interface parameters if this is a complex module parameter.
     * 
     */
    @InputImport(name="modeValuesInfo")
      private final @Nullable Input<Map<String,ModeValueInfoArgs>> modeValuesInfo;

    public Input<Map<String,ModeValueInfoArgs>> getModeValuesInfo() {
        return this.modeValuesInfo == null ? Input.empty() : this.modeValuesInfo;
    }

    /**
     * Parameter name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Parameter type.
     * 
     */
    @InputImport(name="parameterType")
      private final @Nullable Input<String> parameterType;

    public Input<String> getParameterType() {
        return this.parameterType == null ? Input.empty() : this.parameterType;
    }

    public ModuleAssetParameterArgs(
        @Nullable Input<Map<String,ModeValueInfoArgs>> modeValuesInfo,
        @Nullable Input<String> name,
        @Nullable Input<String> parameterType) {
        this.modeValuesInfo = modeValuesInfo;
        this.name = name;
        this.parameterType = parameterType;
    }

    private ModuleAssetParameterArgs() {
        this.modeValuesInfo = Input.empty();
        this.name = Input.empty();
        this.parameterType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleAssetParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,ModeValueInfoArgs>> modeValuesInfo;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parameterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleAssetParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modeValuesInfo = defaults.modeValuesInfo;
    	      this.name = defaults.name;
    	      this.parameterType = defaults.parameterType;
        }

        public Builder modeValuesInfo(@Nullable Input<Map<String,ModeValueInfoArgs>> modeValuesInfo) {
            this.modeValuesInfo = modeValuesInfo;
            return this;
        }

        public Builder modeValuesInfo(@Nullable Map<String,ModeValueInfoArgs> modeValuesInfo) {
            this.modeValuesInfo = Input.ofNullable(modeValuesInfo);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parameterType(@Nullable Input<String> parameterType) {
            this.parameterType = parameterType;
            return this;
        }

        public Builder parameterType(@Nullable String parameterType) {
            this.parameterType = Input.ofNullable(parameterType);
            return this;
        }
        public ModuleAssetParameterArgs build() {
            return new ModuleAssetParameterArgs(modeValuesInfo, name, parameterType);
        }
    }
}
