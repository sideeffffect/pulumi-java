// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.aws.lakeformation.inputs.PermissionsDataLocationGetArgs;
import io.pulumi.aws.lakeformation.inputs.PermissionsDatabaseGetArgs;
import io.pulumi.aws.lakeformation.inputs.PermissionsTableGetArgs;
import io.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionsState extends io.pulumi.resources.ResourceArgs {

    public static final PermissionsState Empty = new PermissionsState();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId == null ? Codegen.empty() : this.catalogId;
    }

    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    @Import(name="catalogResource")
      private final @Nullable Output<Boolean> catalogResource;

    public Output<Boolean> catalogResource() {
        return this.catalogResource == null ? Codegen.empty() : this.catalogResource;
    }

    /**
     * Configuration block for a data location resource. Detailed below.
     * 
     */
    @Import(name="dataLocation")
      private final @Nullable Output<PermissionsDataLocationGetArgs> dataLocation;

    public Output<PermissionsDataLocationGetArgs> dataLocation() {
        return this.dataLocation == null ? Codegen.empty() : this.dataLocation;
    }

    /**
     * Configuration block for a database resource. Detailed below.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<PermissionsDatabaseGetArgs> database;

    public Output<PermissionsDatabaseGetArgs> database() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    /**
     * List of permissions granted to the principal. Valid values may include `ALL`, `ALTER`, `CREATE_DATABASE`, `CREATE_TABLE`, `DATA_LOCATION_ACCESS`, `DELETE`, `DESCRIBE`, `DROP`, `INSERT`, and `SELECT`. For details on each permission, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<String>> permissions;

    public Output<List<String>> permissions() {
        return this.permissions == null ? Codegen.empty() : this.permissions;
    }

    /**
     * Subset of `permissions` which the principal can pass.
     * 
     */
    @Import(name="permissionsWithGrantOptions")
      private final @Nullable Output<List<String>> permissionsWithGrantOptions;

    public Output<List<String>> permissionsWithGrantOptions() {
        return this.permissionsWithGrantOptions == null ? Codegen.empty() : this.permissionsWithGrantOptions;
    }

    /**
     * Principal to be granted the permissions on the resource. Supported principals include `IAM_ALLOWED_PRINCIPALS` (see Default Behavior and `IAMAllowedPrincipals` above), IAM roles, users, groups, SAML groups and users, QuickSight groups, OUs, and organizations as well as AWS account IDs for cross-account permissions. For more information, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="principal")
      private final @Nullable Output<String> principal;

    public Output<String> principal() {
        return this.principal == null ? Codegen.empty() : this.principal;
    }

    /**
     * Configuration block for a table resource. Detailed below.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<PermissionsTableGetArgs> table;

    public Output<PermissionsTableGetArgs> table() {
        return this.table == null ? Codegen.empty() : this.table;
    }

    /**
     * Configuration block for a table with columns resource. Detailed below.
     * 
     */
    @Import(name="tableWithColumns")
      private final @Nullable Output<PermissionsTableWithColumnsGetArgs> tableWithColumns;

    public Output<PermissionsTableWithColumnsGetArgs> tableWithColumns() {
        return this.tableWithColumns == null ? Codegen.empty() : this.tableWithColumns;
    }

    public PermissionsState(
        @Nullable Output<String> catalogId,
        @Nullable Output<Boolean> catalogResource,
        @Nullable Output<PermissionsDataLocationGetArgs> dataLocation,
        @Nullable Output<PermissionsDatabaseGetArgs> database,
        @Nullable Output<List<String>> permissions,
        @Nullable Output<List<String>> permissionsWithGrantOptions,
        @Nullable Output<String> principal,
        @Nullable Output<PermissionsTableGetArgs> table,
        @Nullable Output<PermissionsTableWithColumnsGetArgs> tableWithColumns) {
        this.catalogId = catalogId;
        this.catalogResource = catalogResource;
        this.dataLocation = dataLocation;
        this.database = database;
        this.permissions = permissions;
        this.permissionsWithGrantOptions = permissionsWithGrantOptions;
        this.principal = principal;
        this.table = table;
        this.tableWithColumns = tableWithColumns;
    }

    private PermissionsState() {
        this.catalogId = Codegen.empty();
        this.catalogResource = Codegen.empty();
        this.dataLocation = Codegen.empty();
        this.database = Codegen.empty();
        this.permissions = Codegen.empty();
        this.permissionsWithGrantOptions = Codegen.empty();
        this.principal = Codegen.empty();
        this.table = Codegen.empty();
        this.tableWithColumns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> catalogId;
        private @Nullable Output<Boolean> catalogResource;
        private @Nullable Output<PermissionsDataLocationGetArgs> dataLocation;
        private @Nullable Output<PermissionsDatabaseGetArgs> database;
        private @Nullable Output<List<String>> permissions;
        private @Nullable Output<List<String>> permissionsWithGrantOptions;
        private @Nullable Output<String> principal;
        private @Nullable Output<PermissionsTableGetArgs> table;
        private @Nullable Output<PermissionsTableWithColumnsGetArgs> tableWithColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.catalogResource = defaults.catalogResource;
    	      this.dataLocation = defaults.dataLocation;
    	      this.database = defaults.database;
    	      this.permissions = defaults.permissions;
    	      this.permissionsWithGrantOptions = defaults.permissionsWithGrantOptions;
    	      this.principal = defaults.principal;
    	      this.table = defaults.table;
    	      this.tableWithColumns = defaults.tableWithColumns;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Codegen.ofNullable(catalogId);
            return this;
        }
        public Builder catalogResource(@Nullable Output<Boolean> catalogResource) {
            this.catalogResource = catalogResource;
            return this;
        }
        public Builder catalogResource(@Nullable Boolean catalogResource) {
            this.catalogResource = Codegen.ofNullable(catalogResource);
            return this;
        }
        public Builder dataLocation(@Nullable Output<PermissionsDataLocationGetArgs> dataLocation) {
            this.dataLocation = dataLocation;
            return this;
        }
        public Builder dataLocation(@Nullable PermissionsDataLocationGetArgs dataLocation) {
            this.dataLocation = Codegen.ofNullable(dataLocation);
            return this;
        }
        public Builder database(@Nullable Output<PermissionsDatabaseGetArgs> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable PermissionsDatabaseGetArgs database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Codegen.ofNullable(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder permissionsWithGrantOptions(@Nullable Output<List<String>> permissionsWithGrantOptions) {
            this.permissionsWithGrantOptions = permissionsWithGrantOptions;
            return this;
        }
        public Builder permissionsWithGrantOptions(@Nullable List<String> permissionsWithGrantOptions) {
            this.permissionsWithGrantOptions = Codegen.ofNullable(permissionsWithGrantOptions);
            return this;
        }
        public Builder permissionsWithGrantOptions(String... permissionsWithGrantOptions) {
            return permissionsWithGrantOptions(List.of(permissionsWithGrantOptions));
        }
        public Builder principal(@Nullable Output<String> principal) {
            this.principal = principal;
            return this;
        }
        public Builder principal(@Nullable String principal) {
            this.principal = Codegen.ofNullable(principal);
            return this;
        }
        public Builder table(@Nullable Output<PermissionsTableGetArgs> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable PermissionsTableGetArgs table) {
            this.table = Codegen.ofNullable(table);
            return this;
        }
        public Builder tableWithColumns(@Nullable Output<PermissionsTableWithColumnsGetArgs> tableWithColumns) {
            this.tableWithColumns = tableWithColumns;
            return this;
        }
        public Builder tableWithColumns(@Nullable PermissionsTableWithColumnsGetArgs tableWithColumns) {
            this.tableWithColumns = Codegen.ofNullable(tableWithColumns);
            return this;
        }        public PermissionsState build() {
            return new PermissionsState(catalogId, catalogResource, dataLocation, database, permissions, permissionsWithGrantOptions, principal, table, tableWithColumns);
        }
    }
}
