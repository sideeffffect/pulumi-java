// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerResourcesArgs Empty = new ServiceTemplateSpecContainerResourcesArgs();

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @Import(name="limits")
      private final @Nullable Output<Map<String,String>> limits;

    public Output<Map<String,String>> limits() {
        return this.limits == null ? Codegen.empty() : this.limits;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is
     * explicitly specified, otherwise to an implementation-defined value.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @Import(name="requests")
      private final @Nullable Output<Map<String,String>> requests;

    public Output<Map<String,String>> requests() {
        return this.requests == null ? Codegen.empty() : this.requests;
    }

    public ServiceTemplateSpecContainerResourcesArgs(
        @Nullable Output<Map<String,String>> limits,
        @Nullable Output<Map<String,String>> requests) {
        this.limits = limits;
        this.requests = requests;
    }

    private ServiceTemplateSpecContainerResourcesArgs() {
        this.limits = Codegen.empty();
        this.requests = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> limits;
        private @Nullable Output<Map<String,String>> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(@Nullable Output<Map<String,String>> limits) {
            this.limits = limits;
            return this;
        }
        public Builder limits(@Nullable Map<String,String> limits) {
            this.limits = Codegen.ofNullable(limits);
            return this;
        }
        public Builder requests(@Nullable Output<Map<String,String>> requests) {
            this.requests = requests;
            return this;
        }
        public Builder requests(@Nullable Map<String,String> requests) {
            this.requests = Codegen.ofNullable(requests);
            return this;
        }        public ServiceTemplateSpecContainerResourcesArgs build() {
            return new ServiceTemplateSpecContainerResourcesArgs(limits, requests);
        }
    }
}
