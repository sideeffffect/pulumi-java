// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The custom domain assigned to this storage account. This can be set via Update.
 * 
 */
public final class CustomDomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDomainArgs Empty = new CustomDomainArgs();

    /**
     * Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    @InputImport(name="useSubDomainName")
      private final @Nullable Input<Boolean> useSubDomainName;

    public Input<Boolean> getUseSubDomainName() {
        return this.useSubDomainName == null ? Input.empty() : this.useSubDomainName;
    }

    public CustomDomainArgs(
        Input<String> name,
        @Nullable Input<Boolean> useSubDomainName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.useSubDomainName = useSubDomainName;
    }

    private CustomDomainArgs() {
        this.name = Input.empty();
        this.useSubDomainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<Boolean> useSubDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.useSubDomainName = defaults.useSubDomainName;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder useSubDomainName(@Nullable Input<Boolean> useSubDomainName) {
            this.useSubDomainName = useSubDomainName;
            return this;
        }

        public Builder useSubDomainName(@Nullable Boolean useSubDomainName) {
            this.useSubDomainName = Input.ofNullable(useSubDomainName);
            return this;
        }
        public CustomDomainArgs build() {
            return new CustomDomainArgs(name, useSubDomainName);
        }
    }
}
