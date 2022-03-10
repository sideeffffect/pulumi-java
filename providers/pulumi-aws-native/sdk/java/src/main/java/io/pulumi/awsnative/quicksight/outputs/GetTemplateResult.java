// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.TemplateResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.TemplateTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTemplateResult {
    /**
     * <p>The Amazon Resource Name (ARN) of the template.</p>
     * 
     */
    private final @Nullable String arn;
    /**
     * <p>A display name for the template.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>A list of resource permissions to be set on the template. </p>
     * 
     */
    private final @Nullable List<TemplateResourcePermission> permissions;
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.</p>
     * 
     */
    private final @Nullable List<TemplateTag> tags;

    @OutputCustomType.Constructor
    private GetTemplateResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("permissions") @Nullable List<TemplateResourcePermission> permissions,
        @OutputCustomType.Parameter("tags") @Nullable List<TemplateTag> tags) {
        this.arn = arn;
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the template.</p>
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * <p>A display name for the template.</p>
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>A list of resource permissions to be set on the template. </p>
     * 
    */
    public List<TemplateResourcePermission> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.</p>
     * 
    */
    public List<TemplateTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable List<TemplateResourcePermission> permissions;
        private @Nullable List<TemplateTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder permissions(@Nullable List<TemplateResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder tags(@Nullable List<TemplateTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetTemplateResult build() {
            return new GetTemplateResult(arn, name, permissions, tags);
        }
    }
}
