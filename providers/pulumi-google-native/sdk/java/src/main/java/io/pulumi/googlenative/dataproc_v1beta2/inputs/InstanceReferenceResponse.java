// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A reference to a Compute Engine instance.
 * 
 */
public final class InstanceReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceReferenceResponse Empty = new InstanceReferenceResponse();

    /**
     * The unique identifier of the Compute Engine instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The user-friendly name of the Compute Engine instance.
     * 
     */
    @InputImport(name="instanceName", required=true)
      private final String instanceName;

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * The public key used for sharing data with this instance.
     * 
     */
    @InputImport(name="publicKey", required=true)
      private final String publicKey;

    public String getPublicKey() {
        return this.publicKey;
    }

    public InstanceReferenceResponse(
        String instanceId,
        String instanceName,
        String publicKey) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
    }

    private InstanceReferenceResponse() {
        this.instanceId = null;
        this.instanceName = null;
        this.publicKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private String instanceName;
        private String publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }

        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public InstanceReferenceResponse build() {
            return new InstanceReferenceResponse(instanceId, instanceName, publicKey);
        }
    }
}
