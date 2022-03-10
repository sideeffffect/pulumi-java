// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserSshKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserSshKeyArgs Empty = new GetUserSshKeyArgs();

    /**
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
     * 
     */
    @InputImport(name="encoding", required=true)
      private final String encoding;

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * The unique identifier for the SSH public key.
     * 
     */
    @InputImport(name="sshPublicKeyId", required=true)
      private final String sshPublicKeyId;

    public String getSshPublicKeyId() {
        return this.sshPublicKeyId;
    }

    /**
     * The name of the IAM user associated with the SSH public key.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public GetUserSshKeyArgs(
        String encoding,
        String sshPublicKeyId,
        String username) {
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.sshPublicKeyId = Objects.requireNonNull(sshPublicKeyId, "expected parameter 'sshPublicKeyId' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private GetUserSshKeyArgs() {
        this.encoding = null;
        this.sshPublicKeyId = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encoding;
        private String sshPublicKeyId;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSshKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.sshPublicKeyId = defaults.sshPublicKeyId;
    	      this.username = defaults.username;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder sshPublicKeyId(String sshPublicKeyId) {
            this.sshPublicKeyId = Objects.requireNonNull(sshPublicKeyId);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetUserSshKeyArgs build() {
            return new GetUserSshKeyArgs(encoding, sshPublicKeyId, username);
        }
    }
}
