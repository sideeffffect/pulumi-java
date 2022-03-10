// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionsDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionsDatabaseArgs Empty = new PermissionsDatabaseArgs();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @InputImport(name="catalogId")
      private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    /**
     * Name of the table resource.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PermissionsDatabaseArgs(
        @Nullable Input<String> catalogId,
        Input<String> name) {
        this.catalogId = catalogId;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PermissionsDatabaseArgs() {
        this.catalogId = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> catalogId;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.name = defaults.name;
        }

        public Builder catalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public PermissionsDatabaseArgs build() {
            return new PermissionsDatabaseArgs(catalogId, name);
        }
    }
}
