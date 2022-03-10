// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Image repository credential.
 * 
 */
public final class ImageRepositoryCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageRepositoryCredentialResponse Empty = new ImageRepositoryCredentialResponse();

    /**
     * Image repository url (e.g.: mcr.microsoft.com).
     * 
     */
    @InputImport(name="imageRepositoryUrl", required=true)
      private final String imageRepositoryUrl;

    public String getImageRepositoryUrl() {
        return this.imageRepositoryUrl;
    }

    /**
     * Repository user password.
     * 
     */
    @InputImport(name="password")
      private final @Nullable AsymmetricEncryptedSecretResponse password;

    public Optional<AsymmetricEncryptedSecretResponse> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Repository user name.
     * 
     */
    @InputImport(name="userName", required=true)
      private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public ImageRepositoryCredentialResponse(
        String imageRepositoryUrl,
        @Nullable AsymmetricEncryptedSecretResponse password,
        String userName) {
        this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl, "expected parameter 'imageRepositoryUrl' to be non-null");
        this.password = password;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ImageRepositoryCredentialResponse() {
        this.imageRepositoryUrl = null;
        this.password = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRepositoryCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageRepositoryUrl;
        private @Nullable AsymmetricEncryptedSecretResponse password;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRepositoryCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageRepositoryUrl = defaults.imageRepositoryUrl;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder imageRepositoryUrl(String imageRepositoryUrl) {
            this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl);
            return this;
        }

        public Builder password(@Nullable AsymmetricEncryptedSecretResponse password) {
            this.password = password;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public ImageRepositoryCredentialResponse build() {
            return new ImageRepositoryCredentialResponse(imageRepositoryUrl, password, userName);
        }
    }
}
