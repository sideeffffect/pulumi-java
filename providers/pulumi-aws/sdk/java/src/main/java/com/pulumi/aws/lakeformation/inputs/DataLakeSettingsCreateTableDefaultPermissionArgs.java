// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataLakeSettingsCreateTableDefaultPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataLakeSettingsCreateTableDefaultPermissionArgs Empty = new DataLakeSettingsCreateTableDefaultPermissionArgs();

    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `[&#34;ALL&#34;]`.
     * 
     */
    @Import(name="principal")
    private @Nullable Output<String> principal;

    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    private DataLakeSettingsCreateTableDefaultPermissionArgs() {}

    private DataLakeSettingsCreateTableDefaultPermissionArgs(DataLakeSettingsCreateTableDefaultPermissionArgs $) {
        this.permissions = $.permissions;
        this.principal = $.principal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakeSettingsCreateTableDefaultPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakeSettingsCreateTableDefaultPermissionArgs $;

        public Builder() {
            $ = new DataLakeSettingsCreateTableDefaultPermissionArgs();
        }

        public Builder(DataLakeSettingsCreateTableDefaultPermissionArgs defaults) {
            $ = new DataLakeSettingsCreateTableDefaultPermissionArgs(Objects.requireNonNull(defaults));
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public DataLakeSettingsCreateTableDefaultPermissionArgs build() {
            return $;
        }
    }

}
