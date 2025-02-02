// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2StoredTypeResponse {
    /**
     * @return Timestamp indicating when the version of the `StoredInfoType` used for inspection was created. Output-only field, populated by the system.
     * 
     */
    private final String createTime;
    /**
     * @return Resource name of the requested `StoredInfoType`, for example `organizations/433245324/storedInfoTypes/432452342` or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GooglePrivacyDlpV2StoredTypeResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("name") String name) {
        this.createTime = createTime;
        this.name = name;
    }

    /**
     * @return Timestamp indicating when the version of the `StoredInfoType` used for inspection was created. Output-only field, populated by the system.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Resource name of the requested `StoredInfoType`, for example `organizations/433245324/storedInfoTypes/432452342` or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StoredTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StoredTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GooglePrivacyDlpV2StoredTypeResponse build() {
            return new GooglePrivacyDlpV2StoredTypeResponse(createTime, name);
        }
    }
}
