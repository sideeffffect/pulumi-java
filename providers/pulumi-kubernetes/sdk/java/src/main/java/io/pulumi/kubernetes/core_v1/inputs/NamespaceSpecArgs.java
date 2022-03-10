// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NamespaceSpec describes the attributes on a Namespace.
 * 
 */
public final class NamespaceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceSpecArgs Empty = new NamespaceSpecArgs();

    /**
     * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     */
    @InputImport(name="finalizers")
      private final @Nullable Input<List<String>> finalizers;

    public Input<List<String>> getFinalizers() {
        return this.finalizers == null ? Input.empty() : this.finalizers;
    }

    public NamespaceSpecArgs(@Nullable Input<List<String>> finalizers) {
        this.finalizers = finalizers;
    }

    private NamespaceSpecArgs() {
        this.finalizers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> finalizers;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.finalizers = defaults.finalizers;
        }

        public Builder finalizers(@Nullable Input<List<String>> finalizers) {
            this.finalizers = finalizers;
            return this;
        }

        public Builder finalizers(@Nullable List<String> finalizers) {
            this.finalizers = Input.ofNullable(finalizers);
            return this;
        }
        public NamespaceSpecArgs build() {
            return new NamespaceSpecArgs(finalizers);
        }
    }
}
