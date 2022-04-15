// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsCreateDatabaseDefaultPermission;
import io.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsCreateTableDefaultPermission;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataLakeSettingsResult {
    /**
     * List of ARNs of AWS Lake Formation principals (IAM users or roles).
     * 
     */
    private final List<String> admins;
    private final @Nullable String catalogId;
    /**
     * Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * 
     */
    private final List<GetDataLakeSettingsCreateDatabaseDefaultPermission> createDatabaseDefaultPermissions;
    /**
     * Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * 
     */
    private final List<GetDataLakeSettingsCreateTableDefaultPermission> createTableDefaultPermissions;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs).
     * 
     */
    private final List<String> trustedResourceOwners;

    @CustomType.Constructor
    private GetDataLakeSettingsResult(
        @CustomType.Parameter("admins") List<String> admins,
        @CustomType.Parameter("catalogId") @Nullable String catalogId,
        @CustomType.Parameter("createDatabaseDefaultPermissions") List<GetDataLakeSettingsCreateDatabaseDefaultPermission> createDatabaseDefaultPermissions,
        @CustomType.Parameter("createTableDefaultPermissions") List<GetDataLakeSettingsCreateTableDefaultPermission> createTableDefaultPermissions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("trustedResourceOwners") List<String> trustedResourceOwners) {
        this.admins = admins;
        this.catalogId = catalogId;
        this.createDatabaseDefaultPermissions = createDatabaseDefaultPermissions;
        this.createTableDefaultPermissions = createTableDefaultPermissions;
        this.id = id;
        this.trustedResourceOwners = trustedResourceOwners;
    }

    /**
     * List of ARNs of AWS Lake Formation principals (IAM users or roles).
     * 
    */
    public List<String> admins() {
        return this.admins;
    }
    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * 
    */
    public List<GetDataLakeSettingsCreateDatabaseDefaultPermission> createDatabaseDefaultPermissions() {
        return this.createDatabaseDefaultPermissions;
    }
    /**
     * Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * 
    */
    public List<GetDataLakeSettingsCreateTableDefaultPermission> createTableDefaultPermissions() {
        return this.createTableDefaultPermissions;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * List of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs).
     * 
    */
    public List<String> trustedResourceOwners() {
        return this.trustedResourceOwners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakeSettingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> admins;
        private @Nullable String catalogId;
        private List<GetDataLakeSettingsCreateDatabaseDefaultPermission> createDatabaseDefaultPermissions;
        private List<GetDataLakeSettingsCreateTableDefaultPermission> createTableDefaultPermissions;
        private String id;
        private List<String> trustedResourceOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataLakeSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admins = defaults.admins;
    	      this.catalogId = defaults.catalogId;
    	      this.createDatabaseDefaultPermissions = defaults.createDatabaseDefaultPermissions;
    	      this.createTableDefaultPermissions = defaults.createTableDefaultPermissions;
    	      this.id = defaults.id;
    	      this.trustedResourceOwners = defaults.trustedResourceOwners;
        }

        public Builder admins(List<String> admins) {
            this.admins = Objects.requireNonNull(admins);
            return this;
        }
        public Builder admins(String... admins) {
            return admins(List.of(admins));
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder createDatabaseDefaultPermissions(List<GetDataLakeSettingsCreateDatabaseDefaultPermission> createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions = Objects.requireNonNull(createDatabaseDefaultPermissions);
            return this;
        }
        public Builder createDatabaseDefaultPermissions(GetDataLakeSettingsCreateDatabaseDefaultPermission... createDatabaseDefaultPermissions) {
            return createDatabaseDefaultPermissions(List.of(createDatabaseDefaultPermissions));
        }
        public Builder createTableDefaultPermissions(List<GetDataLakeSettingsCreateTableDefaultPermission> createTableDefaultPermissions) {
            this.createTableDefaultPermissions = Objects.requireNonNull(createTableDefaultPermissions);
            return this;
        }
        public Builder createTableDefaultPermissions(GetDataLakeSettingsCreateTableDefaultPermission... createTableDefaultPermissions) {
            return createTableDefaultPermissions(List.of(createTableDefaultPermissions));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder trustedResourceOwners(List<String> trustedResourceOwners) {
            this.trustedResourceOwners = Objects.requireNonNull(trustedResourceOwners);
            return this;
        }
        public Builder trustedResourceOwners(String... trustedResourceOwners) {
            return trustedResourceOwners(List.of(trustedResourceOwners));
        }        public GetDataLakeSettingsResult build() {
            return new GetDataLakeSettingsResult(admins, catalogId, createDatabaseDefaultPermissions, createTableDefaultPermissions, id, trustedResourceOwners);
        }
    }
}
