// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceExtensionPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a cloud service Extension.
 * 
 */
public final class ExtensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExtensionResponse Empty = new ExtensionResponse();

    /**
     * The name of the extension.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Extension Properties.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable CloudServiceExtensionPropertiesResponse properties;

    public Optional<CloudServiceExtensionPropertiesResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    public ExtensionResponse(
        @Nullable String name,
        @Nullable CloudServiceExtensionPropertiesResponse properties) {
        this.name = name;
        this.properties = properties;
    }

    private ExtensionResponse() {
        this.name = null;
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable CloudServiceExtensionPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder properties(@Nullable CloudServiceExtensionPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }
        public ExtensionResponse build() {
            return new ExtensionResponse(name, properties);
        }
    }
}
