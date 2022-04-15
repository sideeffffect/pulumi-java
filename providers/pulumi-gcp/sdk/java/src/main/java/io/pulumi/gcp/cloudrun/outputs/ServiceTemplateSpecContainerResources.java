// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecContainerResources {
    /**
     * Limits describes the maximum amount of compute resources allowed.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final @Nullable Map<String,String> limits;
    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is
     * explicitly specified, otherwise to an implementation-defined value.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final @Nullable Map<String,String> requests;

    @CustomType.Constructor
    private ServiceTemplateSpecContainerResources(
        @CustomType.Parameter("limits") @Nullable Map<String,String> limits,
        @CustomType.Parameter("requests") @Nullable Map<String,String> requests) {
        this.limits = limits;
        this.requests = requests;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
    */
    public Map<String,String> limits() {
        return this.limits == null ? Map.of() : this.limits;
    }
    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is
     * explicitly specified, otherwise to an implementation-defined value.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
    */
    public Map<String,String> requests() {
        return this.requests == null ? Map.of() : this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> limits;
        private @Nullable Map<String,String> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(@Nullable Map<String,String> limits) {
            this.limits = limits;
            return this;
        }
        public Builder requests(@Nullable Map<String,String> requests) {
            this.requests = requests;
            return this;
        }        public ServiceTemplateSpecContainerResources build() {
            return new ServiceTemplateSpecContainerResources(limits, requests);
        }
    }
}
