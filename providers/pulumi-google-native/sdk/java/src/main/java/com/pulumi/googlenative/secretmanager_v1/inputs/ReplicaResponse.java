// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager_v1.inputs.CustomerManagedEncryptionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Replica for this Secret.
 * 
 */
public final class ReplicaResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReplicaResponse Empty = new ReplicaResponse();

    /**
     * Optional. The customer-managed encryption configuration of the User-Managed Replica. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    @Import(name="customerManagedEncryption", required=true)
    private CustomerManagedEncryptionResponse customerManagedEncryption;

    public CustomerManagedEncryptionResponse customerManagedEncryption() {
        return this.customerManagedEncryption;
    }

    /**
     * The canonical IDs of the location to replicate data. For example: `&#34;us-east1&#34;`.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    private ReplicaResponse() {}

    private ReplicaResponse(ReplicaResponse $) {
        this.customerManagedEncryption = $.customerManagedEncryption;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaResponse $;

        public Builder() {
            $ = new ReplicaResponse();
        }

        public Builder(ReplicaResponse defaults) {
            $ = new ReplicaResponse(Objects.requireNonNull(defaults));
        }

        public Builder customerManagedEncryption(CustomerManagedEncryptionResponse customerManagedEncryption) {
            $.customerManagedEncryption = customerManagedEncryption;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public ReplicaResponse build() {
            $.customerManagedEncryption = Objects.requireNonNull($.customerManagedEncryption, "expected parameter 'customerManagedEncryption' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
