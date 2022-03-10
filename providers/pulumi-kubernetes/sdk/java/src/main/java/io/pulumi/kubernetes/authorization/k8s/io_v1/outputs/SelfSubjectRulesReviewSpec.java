// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SelfSubjectRulesReviewSpec {
    /**
     * Namespace to evaluate rules for. Required.
     * 
     */
    private final @Nullable String namespace;

    @OutputCustomType.Constructor
    private SelfSubjectRulesReviewSpec(@OutputCustomType.Parameter("namespace") @Nullable String namespace) {
        this.namespace = namespace;
    }

    /**
     * Namespace to evaluate rules for. Required.
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectRulesReviewSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectRulesReviewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public SelfSubjectRulesReviewSpec build() {
            return new SelfSubjectRulesReviewSpec(namespace);
        }
    }
}
