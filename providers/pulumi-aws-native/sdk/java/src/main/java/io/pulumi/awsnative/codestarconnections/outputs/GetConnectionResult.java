// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codestarconnections.outputs;

import io.pulumi.awsnative.codestarconnections.outputs.ConnectionTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectionResult {
    /**
     * The Amazon Resource Name (ARN) of the  connection. The ARN is used as the connection reference when the connection is shared between AWS services.
     * 
     */
    private final @Nullable String connectionArn;
    /**
     * The current status of the connection.
     * 
     */
    private final @Nullable String connectionStatus;
    /**
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
     * 
     */
    private final @Nullable String ownerAccountId;
    /**
     * Specifies the tags applied to a connection.
     * 
     */
    private final @Nullable List<ConnectionTag> tags;

    @OutputCustomType.Constructor
    private GetConnectionResult(
        @OutputCustomType.Parameter("connectionArn") @Nullable String connectionArn,
        @OutputCustomType.Parameter("connectionStatus") @Nullable String connectionStatus,
        @OutputCustomType.Parameter("ownerAccountId") @Nullable String ownerAccountId,
        @OutputCustomType.Parameter("tags") @Nullable List<ConnectionTag> tags) {
        this.connectionArn = connectionArn;
        this.connectionStatus = connectionStatus;
        this.ownerAccountId = ownerAccountId;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the  connection. The ARN is used as the connection reference when the connection is shared between AWS services.
     * 
    */
    public Optional<String> getConnectionArn() {
        return Optional.ofNullable(this.connectionArn);
    }
    /**
     * The current status of the connection.
     * 
    */
    public Optional<String> getConnectionStatus() {
        return Optional.ofNullable(this.connectionStatus);
    }
    /**
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
     * 
    */
    public Optional<String> getOwnerAccountId() {
        return Optional.ofNullable(this.ownerAccountId);
    }
    /**
     * Specifies the tags applied to a connection.
     * 
    */
    public List<ConnectionTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectionArn;
        private @Nullable String connectionStatus;
        private @Nullable String ownerAccountId;
        private @Nullable List<ConnectionTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionArn = defaults.connectionArn;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.tags = defaults.tags;
        }

        public Builder connectionArn(@Nullable String connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }

        public Builder connectionStatus(@Nullable String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        public Builder ownerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        public Builder tags(@Nullable List<ConnectionTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetConnectionResult build() {
            return new GetConnectionResult(connectionArn, connectionStatus, ownerAccountId, tags);
        }
    }
}
