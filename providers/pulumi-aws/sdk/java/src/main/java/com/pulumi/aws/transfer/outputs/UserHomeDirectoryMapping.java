// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserHomeDirectoryMapping {
    /**
     * @return Represents an entry and a target.
     * 
     */
    private final String entry;
    /**
     * @return Represents the map target.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private UserHomeDirectoryMapping(
        @CustomType.Parameter("entry") String entry,
        @CustomType.Parameter("target") String target) {
        this.entry = entry;
        this.target = target;
    }

    /**
     * @return Represents an entry and a target.
     * 
     */
    public String entry() {
        return this.entry;
    }
    /**
     * @return Represents the map target.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserHomeDirectoryMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entry;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(UserHomeDirectoryMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.target = defaults.target;
        }

        public Builder entry(String entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public UserHomeDirectoryMapping build() {
            return new UserHomeDirectoryMapping(entry, target);
        }
    }
}
