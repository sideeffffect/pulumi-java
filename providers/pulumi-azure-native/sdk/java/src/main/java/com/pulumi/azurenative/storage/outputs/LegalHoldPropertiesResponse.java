// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.TagPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LegalHoldPropertiesResponse {
    /**
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
     */
    private final Boolean hasLegalHold;
    /**
     * The list of LegalHold tags of a blob container.
     * 
     */
    private final @Nullable List<TagPropertyResponse> tags;

    @CustomType.Constructor
    private LegalHoldPropertiesResponse(
        @CustomType.Parameter("hasLegalHold") Boolean hasLegalHold,
        @CustomType.Parameter("tags") @Nullable List<TagPropertyResponse> tags) {
        this.hasLegalHold = hasLegalHold;
        this.tags = tags;
    }

    /**
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
    */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }
    /**
     * The list of LegalHold tags of a blob container.
     * 
    */
    public List<TagPropertyResponse> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LegalHoldPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean hasLegalHold;
        private @Nullable List<TagPropertyResponse> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LegalHoldPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasLegalHold = defaults.hasLegalHold;
    	      this.tags = defaults.tags;
        }

        public Builder hasLegalHold(Boolean hasLegalHold) {
            this.hasLegalHold = Objects.requireNonNull(hasLegalHold);
            return this;
        }
        public Builder tags(@Nullable List<TagPropertyResponse> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TagPropertyResponse... tags) {
            return tags(List.of(tags));
        }        public LegalHoldPropertiesResponse build() {
            return new LegalHoldPropertiesResponse(hasLegalHold, tags);
        }
    }
}
