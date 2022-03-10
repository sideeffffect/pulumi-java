// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The service with name and endpoint names
 * 
 */
public final class WsdlServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WsdlServiceArgs Empty = new WsdlServiceArgs();

    /**
     * List of the endpoints' qualified names
     * 
     */
    @InputImport(name="endpointQualifiedNames")
      private final @Nullable Input<List<String>> endpointQualifiedNames;

    public Input<List<String>> getEndpointQualifiedNames() {
        return this.endpointQualifiedNames == null ? Input.empty() : this.endpointQualifiedNames;
    }

    /**
     * The service's qualified name
     * 
     */
    @InputImport(name="qualifiedName", required=true)
      private final Input<String> qualifiedName;

    public Input<String> getQualifiedName() {
        return this.qualifiedName;
    }

    public WsdlServiceArgs(
        @Nullable Input<List<String>> endpointQualifiedNames,
        Input<String> qualifiedName) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        this.qualifiedName = Objects.requireNonNull(qualifiedName, "expected parameter 'qualifiedName' to be non-null");
    }

    private WsdlServiceArgs() {
        this.endpointQualifiedNames = Input.empty();
        this.qualifiedName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> endpointQualifiedNames;
        private Input<String> qualifiedName;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointQualifiedNames = defaults.endpointQualifiedNames;
    	      this.qualifiedName = defaults.qualifiedName;
        }

        public Builder endpointQualifiedNames(@Nullable Input<List<String>> endpointQualifiedNames) {
            this.endpointQualifiedNames = endpointQualifiedNames;
            return this;
        }

        public Builder endpointQualifiedNames(@Nullable List<String> endpointQualifiedNames) {
            this.endpointQualifiedNames = Input.ofNullable(endpointQualifiedNames);
            return this;
        }

        public Builder qualifiedName(Input<String> qualifiedName) {
            this.qualifiedName = Objects.requireNonNull(qualifiedName);
            return this;
        }

        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = Input.of(Objects.requireNonNull(qualifiedName));
            return this;
        }
        public WsdlServiceArgs build() {
            return new WsdlServiceArgs(endpointQualifiedNames, qualifiedName);
        }
    }
}
