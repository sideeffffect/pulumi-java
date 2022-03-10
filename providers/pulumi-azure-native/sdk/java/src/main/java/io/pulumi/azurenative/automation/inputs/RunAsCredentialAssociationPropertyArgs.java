// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of RunAs credential to use for hybrid worker.
 * 
 */
public final class RunAsCredentialAssociationPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RunAsCredentialAssociationPropertyArgs Empty = new RunAsCredentialAssociationPropertyArgs();

    /**
     * Gets or sets the name of the credential.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public RunAsCredentialAssociationPropertyArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private RunAsCredentialAssociationPropertyArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsCredentialAssociationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsCredentialAssociationPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public RunAsCredentialAssociationPropertyArgs build() {
            return new RunAsCredentialAssociationPropertyArgs(name);
        }
    }
}
