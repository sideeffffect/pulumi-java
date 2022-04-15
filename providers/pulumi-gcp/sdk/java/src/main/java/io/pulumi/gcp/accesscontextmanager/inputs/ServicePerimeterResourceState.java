// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterResourceState extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterResourceState Empty = new ServicePerimeterResourceState();

    /**
     * The name of the Service Perimeter to add this resource to.
     * 
     */
    @Import(name="perimeterName")
      private final @Nullable Output<String> perimeterName;

    public Output<String> perimeterName() {
        return this.perimeterName == null ? Codegen.empty() : this.perimeterName;
    }

    /**
     * A GCP resource that is inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<String> resource;

    public Output<String> resource() {
        return this.resource == null ? Codegen.empty() : this.resource;
    }

    public ServicePerimeterResourceState(
        @Nullable Output<String> perimeterName,
        @Nullable Output<String> resource) {
        this.perimeterName = perimeterName;
        this.resource = resource;
    }

    private ServicePerimeterResourceState() {
        this.perimeterName = Codegen.empty();
        this.resource = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> perimeterName;
        private @Nullable Output<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterResourceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perimeterName = defaults.perimeterName;
    	      this.resource = defaults.resource;
        }

        public Builder perimeterName(@Nullable Output<String> perimeterName) {
            this.perimeterName = perimeterName;
            return this;
        }
        public Builder perimeterName(@Nullable String perimeterName) {
            this.perimeterName = Codegen.ofNullable(perimeterName);
            return this;
        }
        public Builder resource(@Nullable Output<String> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = Codegen.ofNullable(resource);
            return this;
        }        public ServicePerimeterResourceState build() {
            return new ServicePerimeterResourceState(perimeterName, resource);
        }
    }
}
