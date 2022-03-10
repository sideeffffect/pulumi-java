// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolUICustomizationState extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolUICustomizationState Empty = new UserPoolUICustomizationState();

    /**
     * The client ID for the client app. Defaults to `ALL`. If `ALL` is specified, the `css` and/or `image_file` settings will be used for every client that has no UI customization set previously.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
     * 
     */
    @InputImport(name="creationDate")
      private final @Nullable Input<String> creationDate;

    public Input<String> getCreationDate() {
        return this.creationDate == null ? Input.empty() : this.creationDate;
    }

    /**
     * The CSS values in the UI customization, provided as a String. At least one of `css` or `image_file` is required.
     * 
     */
    @InputImport(name="css")
      private final @Nullable Input<String> css;

    public Input<String> getCss() {
        return this.css == null ? Input.empty() : this.css;
    }

    /**
     * The CSS version number.
     * 
     */
    @InputImport(name="cssVersion")
      private final @Nullable Input<String> cssVersion;

    public Input<String> getCssVersion() {
        return this.cssVersion == null ? Input.empty() : this.cssVersion;
    }

    /**
     * The uploaded logo image for the UI customization, provided as a base64-encoded String. Drift detection is not possible for this argument. At least one of `css` or `image_file` is required.
     * 
     */
    @InputImport(name="imageFile")
      private final @Nullable Input<String> imageFile;

    public Input<String> getImageFile() {
        return this.imageFile == null ? Input.empty() : this.imageFile;
    }

    /**
     * The logo image URL for the UI customization.
     * 
     */
    @InputImport(name="imageUrl")
      private final @Nullable Input<String> imageUrl;

    public Input<String> getImageUrl() {
        return this.imageUrl == null ? Input.empty() : this.imageUrl;
    }

    /**
     * The last-modified date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
     * 
     */
    @InputImport(name="lastModifiedDate")
      private final @Nullable Input<String> lastModifiedDate;

    public Input<String> getLastModifiedDate() {
        return this.lastModifiedDate == null ? Input.empty() : this.lastModifiedDate;
    }

    /**
     * The user pool ID for the user pool.
     * 
     */
    @InputImport(name="userPoolId")
      private final @Nullable Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId == null ? Input.empty() : this.userPoolId;
    }

    public UserPoolUICustomizationState(
        @Nullable Input<String> clientId,
        @Nullable Input<String> creationDate,
        @Nullable Input<String> css,
        @Nullable Input<String> cssVersion,
        @Nullable Input<String> imageFile,
        @Nullable Input<String> imageUrl,
        @Nullable Input<String> lastModifiedDate,
        @Nullable Input<String> userPoolId) {
        this.clientId = clientId;
        this.creationDate = creationDate;
        this.css = css;
        this.cssVersion = cssVersion;
        this.imageFile = imageFile;
        this.imageUrl = imageUrl;
        this.lastModifiedDate = lastModifiedDate;
        this.userPoolId = userPoolId;
    }

    private UserPoolUICustomizationState() {
        this.clientId = Input.empty();
        this.creationDate = Input.empty();
        this.css = Input.empty();
        this.cssVersion = Input.empty();
        this.imageFile = Input.empty();
        this.imageUrl = Input.empty();
        this.lastModifiedDate = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUICustomizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> creationDate;
        private @Nullable Input<String> css;
        private @Nullable Input<String> cssVersion;
        private @Nullable Input<String> imageFile;
        private @Nullable Input<String> imageUrl;
        private @Nullable Input<String> lastModifiedDate;
        private @Nullable Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUICustomizationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.creationDate = defaults.creationDate;
    	      this.css = defaults.css;
    	      this.cssVersion = defaults.cssVersion;
    	      this.imageFile = defaults.imageFile;
    	      this.imageUrl = defaults.imageUrl;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder clientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder creationDate(@Nullable Input<String> creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = Input.ofNullable(creationDate);
            return this;
        }

        public Builder css(@Nullable Input<String> css) {
            this.css = css;
            return this;
        }

        public Builder css(@Nullable String css) {
            this.css = Input.ofNullable(css);
            return this;
        }

        public Builder cssVersion(@Nullable Input<String> cssVersion) {
            this.cssVersion = cssVersion;
            return this;
        }

        public Builder cssVersion(@Nullable String cssVersion) {
            this.cssVersion = Input.ofNullable(cssVersion);
            return this;
        }

        public Builder imageFile(@Nullable Input<String> imageFile) {
            this.imageFile = imageFile;
            return this;
        }

        public Builder imageFile(@Nullable String imageFile) {
            this.imageFile = Input.ofNullable(imageFile);
            return this;
        }

        public Builder imageUrl(@Nullable Input<String> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder imageUrl(@Nullable String imageUrl) {
            this.imageUrl = Input.ofNullable(imageUrl);
            return this;
        }

        public Builder lastModifiedDate(@Nullable Input<String> lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Builder lastModifiedDate(@Nullable String lastModifiedDate) {
            this.lastModifiedDate = Input.ofNullable(lastModifiedDate);
            return this;
        }

        public Builder userPoolId(@Nullable Input<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        public Builder userPoolId(@Nullable String userPoolId) {
            this.userPoolId = Input.ofNullable(userPoolId);
            return this;
        }
        public UserPoolUICustomizationState build() {
            return new UserPoolUICustomizationState(clientId, creationDate, css, cssVersion, imageFile, imageUrl, lastModifiedDate, userPoolId);
        }
    }
}
