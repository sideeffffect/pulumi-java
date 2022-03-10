// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.qldb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LedgerState extends io.pulumi.resources.ResourceArgs {

    public static final LedgerState Empty = new LedgerState();

    /**
     * The ARN of the QLDB Ledger
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
     * 
     */
    @InputImport(name="deletionProtection")
      private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * The friendly name for the QLDB Ledger instance. By default generated by this provider.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
     * 
     */
    @InputImport(name="permissionsMode")
      private final @Nullable Input<String> permissionsMode;

    public Input<String> getPermissionsMode() {
        return this.permissionsMode == null ? Input.empty() : this.permissionsMode;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public LedgerState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<String> name,
        @Nullable Input<String> permissionsMode,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.deletionProtection = deletionProtection;
        this.name = name;
        this.permissionsMode = permissionsMode;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private LedgerState() {
        this.arn = Input.empty();
        this.deletionProtection = Input.empty();
        this.name = Input.empty();
        this.permissionsMode = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LedgerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<String> name;
        private @Nullable Input<String> permissionsMode;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(LedgerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.name = defaults.name;
    	      this.permissionsMode = defaults.permissionsMode;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder deletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder permissionsMode(@Nullable Input<String> permissionsMode) {
            this.permissionsMode = permissionsMode;
            return this;
        }

        public Builder permissionsMode(@Nullable String permissionsMode) {
            this.permissionsMode = Input.ofNullable(permissionsMode);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public LedgerState build() {
            return new LedgerState(arn, deletionProtection, name, permissionsMode, tags, tagsAll);
        }
    }
}
