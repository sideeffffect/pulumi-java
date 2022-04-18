// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.inputs.CacheActiveDirectorySettingsResponse;
import com.pulumi.azurenative.storagecache.inputs.CacheUsernameDownloadSettingsResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache Directory Services settings.
 * 
 */
public final class CacheDirectorySettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CacheDirectorySettingsResponse Empty = new CacheDirectorySettingsResponse();

    /**
     * Specifies settings for joining the HPC Cache to an Active Directory domain.
     * 
     */
    @Import(name="activeDirectory")
      private final @Nullable CacheActiveDirectorySettingsResponse activeDirectory;

    public Optional<CacheActiveDirectorySettingsResponse> activeDirectory() {
        return this.activeDirectory == null ? Optional.empty() : Optional.ofNullable(this.activeDirectory);
    }

    /**
     * Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     * 
     */
    @Import(name="usernameDownload")
      private final @Nullable CacheUsernameDownloadSettingsResponse usernameDownload;

    public Optional<CacheUsernameDownloadSettingsResponse> usernameDownload() {
        return this.usernameDownload == null ? Optional.empty() : Optional.ofNullable(this.usernameDownload);
    }

    public CacheDirectorySettingsResponse(
        @Nullable CacheActiveDirectorySettingsResponse activeDirectory,
        @Nullable CacheUsernameDownloadSettingsResponse usernameDownload) {
        this.activeDirectory = activeDirectory;
        this.usernameDownload = usernameDownload;
    }

    private CacheDirectorySettingsResponse() {
        this.activeDirectory = null;
        this.usernameDownload = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheDirectorySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CacheActiveDirectorySettingsResponse activeDirectory;
        private @Nullable CacheUsernameDownloadSettingsResponse usernameDownload;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheDirectorySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectory = defaults.activeDirectory;
    	      this.usernameDownload = defaults.usernameDownload;
        }

        public Builder activeDirectory(@Nullable CacheActiveDirectorySettingsResponse activeDirectory) {
            this.activeDirectory = activeDirectory;
            return this;
        }
        public Builder usernameDownload(@Nullable CacheUsernameDownloadSettingsResponse usernameDownload) {
            this.usernameDownload = usernameDownload;
            return this;
        }        public CacheDirectorySettingsResponse build() {
            return new CacheDirectorySettingsResponse(activeDirectory, usernameDownload);
        }
    }
}
