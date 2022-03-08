// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDataLakeSettingsCreateDatabaseDefaultPermission {
    /**
     * List of permissions granted to the principal.
     * 
     */
    private final List<String> permissions;
    /**
     * Principal who is granted permissions.
     * 
     */
    private final String principal;

    @OutputCustomType.Constructor({"permissions","principal"})
    private GetDataLakeSettingsCreateDatabaseDefaultPermission(
        List<String> permissions,
        String principal) {
        this.permissions = permissions;
        this.principal = principal;
    }

    /**
     * List of permissions granted to the principal.
     * 
    */
    public List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Principal who is granted permissions.
     * 
    */
    public String getPrincipal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakeSettingsCreateDatabaseDefaultPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> permissions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataLakeSettingsCreateDatabaseDefaultPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public GetDataLakeSettingsCreateDatabaseDefaultPermission build() {
            return new GetDataLakeSettingsCreateDatabaseDefaultPermission(permissions, principal);
        }
    }
}
