// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageRepositoryCredentialResponse {
    /**
     * Image repository url (e.g.: mcr.microsoft.com).
     * 
     */
    private final String imageRepositoryUrl;
    /**
     * Repository user password.
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse password;
    /**
     * Repository user name.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"imageRepositoryUrl","password","userName"})
    private ImageRepositoryCredentialResponse(
        String imageRepositoryUrl,
        @Nullable AsymmetricEncryptedSecretResponse password,
        String userName) {
        this.imageRepositoryUrl = imageRepositoryUrl;
        this.password = password;
        this.userName = userName;
    }

    /**
     * Image repository url (e.g.: mcr.microsoft.com).
     * 
    */
    public String getImageRepositoryUrl() {
        return this.imageRepositoryUrl;
    }
    /**
     * Repository user password.
     * 
    */
    public Optional<AsymmetricEncryptedSecretResponse> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Repository user name.
     * 
    */
    public String getUserName() {
        return this.userName;
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

        public Builder setImageRepositoryUrl(String imageRepositoryUrl) {
            this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl);
            return this;
        }

        public Builder setPassword(@Nullable AsymmetricEncryptedSecretResponse password) {
            this.password = password;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public ImageRepositoryCredentialResponse build() {
            return new ImageRepositoryCredentialResponse(imageRepositoryUrl, password, userName);
        }
    }
}
