// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserResult {
    /**
     * The user email address, as it was specified during registration.
     * 
     */
    private final String email;
    /**
     * The user family name, as it was specified during registration.
     * 
     */
    private final String familyName;
    /**
     * The user given name, as it was specified during registration.
     * 
     */
    private final String givenName;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The user tenant ID, as it was specified during registration.
     * 
     */
    private final String tenantId;
    /**
     * How long the user has used his VMs in this lab
     * 
     */
    private final String totalUsage;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @OutputCustomType.Constructor
    private GetUserResult(
        @OutputCustomType.Parameter("email") String email,
        @OutputCustomType.Parameter("familyName") String familyName,
        @OutputCustomType.Parameter("givenName") String givenName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("latestOperationResult") LatestOperationResultResponse latestOperationResult,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("totalUsage") String totalUsage,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uniqueIdentifier") @Nullable String uniqueIdentifier) {
        this.email = email;
        this.familyName = familyName;
        this.givenName = givenName;
        this.id = id;
        this.latestOperationResult = latestOperationResult;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.tenantId = tenantId;
        this.totalUsage = totalUsage;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * The user email address, as it was specified during registration.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The user family name, as it was specified during registration.
     * 
    */
    public String getFamilyName() {
        return this.familyName;
    }
    /**
     * The user given name, as it was specified during registration.
     * 
    */
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
    */
    public LatestOperationResultResponse getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The user tenant ID, as it was specified during registration.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * How long the user has used his VMs in this lab
     * 
    */
    public String getTotalUsage() {
        return this.totalUsage;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public Optional<String> getUniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String familyName;
        private String givenName;
        private String id;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String totalUsage;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.familyName = defaults.familyName;
    	      this.givenName = defaults.givenName;
    	      this.id = defaults.id;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.totalUsage = defaults.totalUsage;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder familyName(String familyName) {
            this.familyName = Objects.requireNonNull(familyName);
            return this;
        }

        public Builder givenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder latestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder totalUsage(String totalUsage) {
            this.totalUsage = Objects.requireNonNull(totalUsage);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }
        public GetUserResult build() {
            return new GetUserResult(email, familyName, givenName, id, latestOperationResult, location, name, provisioningState, tags, tenantId, totalUsage, type, uniqueIdentifier);
        }
    }
}
