// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileInforNexusConnectorProfileCredentials {
    /**
     * The Access Key portion of the credentials.
     * 
     */
    private final String accessKeyId;
    /**
     * The encryption keys used to encrypt data.
     * 
     */
    private final String datakey;
    /**
     * The secret key used to sign requests.
     * 
     */
    private final String secretAccessKey;
    /**
     * The identiﬁer for the user.
     * 
     */
    private final String userId;

    @OutputCustomType.Constructor
    private ConnectorProfileInforNexusConnectorProfileCredentials(
        @OutputCustomType.Parameter("accessKeyId") String accessKeyId,
        @OutputCustomType.Parameter("datakey") String datakey,
        @OutputCustomType.Parameter("secretAccessKey") String secretAccessKey,
        @OutputCustomType.Parameter("userId") String userId) {
        this.accessKeyId = accessKeyId;
        this.datakey = datakey;
        this.secretAccessKey = secretAccessKey;
        this.userId = userId;
    }

    /**
     * The Access Key portion of the credentials.
     * 
    */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }
    /**
     * The encryption keys used to encrypt data.
     * 
    */
    public String getDatakey() {
        return this.datakey;
    }
    /**
     * The secret key used to sign requests.
     * 
    */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }
    /**
     * The identiﬁer for the user.
     * 
    */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileInforNexusConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKeyId;
        private String datakey;
        private String secretAccessKey;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileInforNexusConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.datakey = defaults.datakey;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.userId = defaults.userId;
        }

        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder datakey(String datakey) {
            this.datakey = Objects.requireNonNull(datakey);
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public ConnectorProfileInforNexusConnectorProfileCredentials build() {
            return new ConnectorProfileInforNexusConnectorProfileCredentials(accessKeyId, datakey, secretAccessKey, userId);
        }
    }
}
