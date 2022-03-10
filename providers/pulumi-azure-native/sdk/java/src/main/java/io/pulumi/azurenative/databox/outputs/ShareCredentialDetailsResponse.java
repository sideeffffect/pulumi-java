// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ShareCredentialDetailsResponse {
    /**
     * Password for the share.
     * 
     */
    private final String password;
    /**
     * Name of the share.
     * 
     */
    private final String shareName;
    /**
     * Type of the share.
     * 
     */
    private final String shareType;
    /**
     * Access protocols supported on the device.
     * 
     */
    private final List<String> supportedAccessProtocols;
    /**
     * User name for the share.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor
    private ShareCredentialDetailsResponse(
        @OutputCustomType.Parameter("password") String password,
        @OutputCustomType.Parameter("shareName") String shareName,
        @OutputCustomType.Parameter("shareType") String shareType,
        @OutputCustomType.Parameter("supportedAccessProtocols") List<String> supportedAccessProtocols,
        @OutputCustomType.Parameter("userName") String userName) {
        this.password = password;
        this.shareName = shareName;
        this.shareType = shareType;
        this.supportedAccessProtocols = supportedAccessProtocols;
        this.userName = userName;
    }

    /**
     * Password for the share.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * Name of the share.
     * 
    */
    public String getShareName() {
        return this.shareName;
    }
    /**
     * Type of the share.
     * 
    */
    public String getShareType() {
        return this.shareType;
    }
    /**
     * Access protocols supported on the device.
     * 
    */
    public List<String> getSupportedAccessProtocols() {
        return this.supportedAccessProtocols;
    }
    /**
     * User name for the share.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareCredentialDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String shareName;
        private String shareType;
        private List<String> supportedAccessProtocols;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareCredentialDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.shareName = defaults.shareName;
    	      this.shareType = defaults.shareType;
    	      this.supportedAccessProtocols = defaults.supportedAccessProtocols;
    	      this.userName = defaults.userName;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder shareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }

        public Builder supportedAccessProtocols(List<String> supportedAccessProtocols) {
            this.supportedAccessProtocols = Objects.requireNonNull(supportedAccessProtocols);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public ShareCredentialDetailsResponse build() {
            return new ShareCredentialDetailsResponse(password, shareName, shareType, supportedAccessProtocols, userName);
        }
    }
}
