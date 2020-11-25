/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moduliths.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link ModuleDetectionStrategy}.
 *
 * @author Oliver Drotbohm
 */
public class ModuleDetectionStrategyUnitTest {

	@Test // #138
	void usesExplicitlyAnnotatedConstant() {

		assertThat(ModuleDetectionStrategy.explictlyAnnotated())
				.isEqualTo(ModuleDetectionStrategies.EXPLICITLY_ANNOTATED);
	}

	@Test // #138
	void usesDirectSubPackages() {

		assertThat(ModuleDetectionStrategy.directSubPackage())
				.isEqualTo(ModuleDetectionStrategies.DIRECT_SUB_PACKAGES);
	}
}
