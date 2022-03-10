// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListIotHubResourceKeysForKeyNameResult {
    /**
     * The name of the shared access policy.
     * 
     */
    private final String keyName;
    /**
     * The primary key.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * The permissions assigned to the shared access policy.
     * 
     */
    private final String rights;
    /**
     * The secondary key.
     * 
     */
    private final @Nullable String secondaryKey;

    @OutputCustomType.Constructor
    private ListIotHubResourceKeysForKeyNameResult(
        @OutputCustomType.Parameter("keyName") String keyName,
        @OutputCustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @OutputCustomType.Parameter("rights") String rights,
        @OutputCustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.keyName = keyName;
        this.primaryKey = primaryKey;
        this.rights = rights;
        this.secondaryKey = secondaryKey;
    }

    /**
     * The name of the shared access policy.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The primary key.
     * 
    */
    public Optional<String> getPrimaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * The permissions assigned to the shared access policy.
     * 
    */
    public String getRights() {
        return this.rights;
    }
    /**
     * The secondary key.
     * 
    */
    public Optional<String> getSecondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIotHubResourceKeysForKeyNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private @Nullable String primaryKey;
        private String rights;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIotHubResourceKeysForKeyNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryKey = defaults.primaryKey;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder rights(String rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public ListIotHubResourceKeysForKeyNameResult build() {
            return new ListIotHubResourceKeysForKeyNameResult(keyName, primaryKey, rights, secondaryKey);
        }
    }
}
