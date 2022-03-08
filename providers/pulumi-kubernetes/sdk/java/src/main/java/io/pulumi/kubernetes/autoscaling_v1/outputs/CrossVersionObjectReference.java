// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CrossVersionObjectReference {
    /**
     * API version of the referent
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
     * 
     */
    private final String kind;
    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"apiVersion","kind","name"})
    private CrossVersionObjectReference(
        @Nullable String apiVersion,
        String kind,
        String name) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
    }

    /**
     * API version of the referent
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrossVersionObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CrossVersionObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public CrossVersionObjectReference build() {
            return new CrossVersionObjectReference(apiVersion, kind, name);
        }
    }
}
