// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ManagedClusterPodIdentityExceptionResponse {
    /**
     * Name of the pod identity exception.
     * 
     */
    private final String name;
    /**
     * Namespace of the pod identity exception.
     * 
     */
    private final String namespace;
    /**
     * Pod labels to match.
     * 
     */
    private final Map<String,String> podLabels;

    @OutputCustomType.Constructor({"name","namespace","podLabels"})
    private ManagedClusterPodIdentityExceptionResponse(
        String name,
        String namespace,
        Map<String,String> podLabels) {
        this.name = name;
        this.namespace = namespace;
        this.podLabels = podLabels;
    }

    /**
     * Name of the pod identity exception.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Namespace of the pod identity exception.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * Pod labels to match.
     * 
    */
    public Map<String,String> getPodLabels() {
        return this.podLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityExceptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;
        private Map<String,String> podLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityExceptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.podLabels = defaults.podLabels;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setPodLabels(Map<String,String> podLabels) {
            this.podLabels = Objects.requireNonNull(podLabels);
            return this;
        }
        public ManagedClusterPodIdentityExceptionResponse build() {
            return new ManagedClusterPodIdentityExceptionResponse(name, namespace, podLabels);
        }
    }
}
