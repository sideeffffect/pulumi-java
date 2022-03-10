// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs Empty = new DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs();

    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `["ALL"]`.
     * 
     */
    @InputImport(name="principal")
      private final @Nullable Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal == null ? Input.empty() : this.principal;
    }

    public DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs(
        @Nullable Input<List<String>> permissions,
        @Nullable Input<String> principal) {
        this.permissions = permissions;
        this.principal = principal;
    }

    private DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs() {
        this.permissions = Input.empty();
        this.principal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> permissions;
        private @Nullable Input<String> principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder permissions(@Nullable Input<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder principal(@Nullable Input<String> principal) {
            this.principal = principal;
            return this;
        }

        public Builder principal(@Nullable String principal) {
            this.principal = Input.ofNullable(principal);
            return this;
        }
        public DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs build() {
            return new DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs(permissions, principal);
        }
    }
}
